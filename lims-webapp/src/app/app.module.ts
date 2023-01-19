import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestProgrammComponent } from './components/test-programm/test-programm.component';
import {AgGridModule} from "ag-grid-angular";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    TestProgrammComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AgGridModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
