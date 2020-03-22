import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {GetJobAdminComponent} from "../get-job-admin/get-job-admin.component";


const routes: Routes = [
  { path: 'see-all-job', component: GetJobAdminComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AdminPageRoutingModule { }
