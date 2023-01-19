import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {TestProgrammComponent} from "./components/test-programm/test-programm.component";

const routes: Routes = [
  { path: 'test-programm', component: TestProgrammComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
