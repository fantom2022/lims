import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {TestProgramComponent} from "./components/tabledata/test-programm/test-program.component";
import {LoginComponent} from "./components/forms/login/login.component";
import {NotFoundComponent} from "./components/forms/not-found/not-found.component";
import {UserListComponent} from "./components/tabledata/user-list/user-list.component";

const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'users', component: UserListComponent},
  {path: 'test', component: TestProgramComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: '**', component: NotFoundComponent}, //not-found это **
  //{path: 'test-programms', component: TestProgrammComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
