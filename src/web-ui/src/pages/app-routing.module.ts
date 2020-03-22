import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { GetJobComponent } from '../pages/get-job/get-job.component';
import {ApplyToJobComponent} from "../pages/apply-to-job/apply-to-job.component";
import {ResultPageComponent} from "../pages/result-page/result-page.component";
import {LoginPageComponent} from "../pages/login-page/login-page.component";
import {AdminPageComponent} from "../admin-pages/admin-page/admin-page.component";
import {GetJobAdminComponent} from '../admin-pages/get-job-admin/get-job-admin.component';
import {GetApplicantComponent} from "../admin-pages/get-applicant/get-applicant.component";
import {DeleteJobComponent} from "../admin-pages/delete-job/delete-job.component";
import {AddJobComponent} from "../admin-pages/add-job/add-job.component";

const routes: Routes = [
  {path: 'login', component: LoginPageComponent},
  {path: 'job-posting', component: GetJobComponent},
  {path: 'apply-job', component: ApplyToJobComponent},
  {path: 'result-page', component: ResultPageComponent},
  {path: 'admin-page', component: AdminPageComponent },
  {path: 'see-all-job', component: GetJobAdminComponent},
  {path: 'see-all-job/get-applicant', component: GetApplicantComponent},
  {path: 'delete-job', component: DeleteJobComponent},
  {path: 'add-job', component: AddJobComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
