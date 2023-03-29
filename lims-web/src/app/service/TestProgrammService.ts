import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {TestProgrammDto} from "../dto/TestProgrammDto";

@Injectable()
export class TestProgrammService {

  constructor(private http: HttpClient) {}

  private baseUrl = 'http://localhost:8080/tests';

  getTests(): Observable<Array<TestProgrammDto>> {
    const res = this.http.get<Array<TestProgrammDto>>(`${this.baseUrl}/all`);
    return res;
  }
}
