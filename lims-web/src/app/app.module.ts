import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {TestProgramComponent} from "./components/tabledata/test-programm/test-program.component";
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from '@angular/common/http';
import {AgGridModule} from "ag-grid-angular";
import {LoginComponent} from './components/forms/login/login.component';
import {NotFoundComponent} from './components/forms/not-found/not-found.component';
import {UserListComponent} from "./components/tabledata/user-list/user-list.component";
import {AccordionModule} from 'primeng/accordion';
import {InputTextModule} from 'primeng/inputtext'
import {ButtonModule} from "primeng/button";

@NgModule({
  declarations: [
    AppComponent,
    TestProgramComponent,
    LoginComponent,
    NotFoundComponent,
    UserListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AgGridModule,
    AccordionModule,
    InputTextModule,
    ButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
