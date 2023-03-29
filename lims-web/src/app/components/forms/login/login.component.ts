import {Component, OnInit} from '@angular/core';
import {UserDto} from "../../../dto/UserDto";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  user= new UserDto("Artem", "Gorlov");
  loading = false;

  ngOnInit(): void {

  }

  constructor() {
  }

  onInput(event: any) {
    console.log(event);
  }
}
