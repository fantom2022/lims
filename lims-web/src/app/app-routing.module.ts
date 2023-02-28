import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {TestProgrammComponent} from "./components/tabledata/test-programm/test-programm.component";
import {LoginComponent} from "./components/forms/login/login.component";
import {NotFoundComponent} from "./components/forms/not-found/not-found.component";
import {AppComponent} from "./app.component";

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: '**', component: NotFoundComponent}, //not-found это **
  {path: 'test-programms', component: TestProgrammComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}