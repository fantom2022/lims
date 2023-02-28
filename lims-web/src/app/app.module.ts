import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {TestProgrammComponent} from "./components/tabledata/test-programm/test-programm.component";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from '@angular/common/http';
import {AgGridModule} from "ag-grid-angular";
import {LoginComponent} from './components/forms/login/login.component';
import {NotFoundComponent} from './components/forms/not-found/not-found.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    TestProgrammComponent,
    LoginComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AgGridModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
