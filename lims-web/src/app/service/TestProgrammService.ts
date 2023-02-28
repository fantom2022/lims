import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {TestProgramm} from "../dto/TestProgramm";

@Injectable()
export class TestProgrammService {

  constructor(private http: HttpClient) {}

  private baseUrl = 'http://localhost:8080/tests';

  getTests(): Observable<Array<TestProgramm>> {
    const res = this.http.get<Array<TestProgramm>>(`${this.baseUrl}/all`);
    return res;
  }
}
