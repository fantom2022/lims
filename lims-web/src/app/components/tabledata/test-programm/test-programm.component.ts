import {Component, OnInit, ViewChild} from '@angular/core';
import {TestProgramm} from "../../../dto/TestProgramm";
import {TestProgrammService} from "../../../service/TestProgrammService";
import {ColDef, GridReadyEvent} from "ag-grid-community";
import {AgGridAngular} from "ag-grid-angular";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-test-programm',
  templateUrl: './test-programm.component.html',
  styleUrls: ['./test-programm.component.scss'],
  providers: [TestProgrammService]
})
export class TestProgrammComponent implements OnInit {

  public tests: TestProgramm[];

  constructor(private testProgrammService: TestProgrammService,
              private http: HttpClient) {
  }

  // Each Column Definition results in one Column.
  public columnDefs: ColDef[] = [
    {field: 'Id', lockVisible: true},
    {field: 'Номер испытания', sort: "desc"},
    {field: 'Количество'},
    {field: 'Дата начала'},
    {field: 'Дата окончания'}
  ];

  // DefaultColDef sets props common to all Columns
  public defaultColDef: ColDef = {
    sortable: true,
    filter: true,
  };

  // For accessing the Grid's API
  @ViewChild(AgGridAngular) agGrid!: AgGridAngular;

  ngOnInit(): void {

  }

  // Example using Grid's API
  clearSelection(): void {
    this.agGrid.api.deselectAll();
  }

  // Load data from sever
  onGridReady($event: GridReadyEvent<any>) {
    this.testProgrammService.getTests().subscribe(
      (response) => {
        this.tests = response;
      });
  }
}
