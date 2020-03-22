import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpModule} from '@angular/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';


import {FormsModule} from "@angular/forms";
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import { JobServiceService } from '../service/job-service.service';
import {RouterModule} from "@angular/router";



import { GetJobComponent } from '../pages/get-job/get-job.component';
import { ApplyToJobComponent } from '../pages/apply-to-job/apply-to-job.component';
import { ResultPageComponent } from '../pages/result-page/result-page.component';
import {ApplicantService} from "../service/applicant.service";
import { LoginPageComponent } from '../pages/login-page/login-page.component';
import {JwtInterceptor} from "../lib/security/jwt.interceptor";
import {AuthenticationService} from "../lib/security/authentication.service";
import {AuthGuard} from "../lib/security/auth.guard";
import {ErrorInterceptor} from "../lib/security/authentication.interceptor";
import { AdminPageComponent } from '../admin-pages/admin-page/admin-page.component';
import {LoginService} from "../service/login.service";
import {GetJobAdminComponent} from "../admin-pages/get-job-admin/get-job-admin.component";
import { AddJobComponent } from '../admin-pages/add-job/add-job.component';

import { GetApplicantComponent } from '../admin-pages/get-applicant/get-applicant.component';
import {HrService} from '../service/hr.service';
import { DeleteJobComponent } from '../admin-pages/delete-job/delete-job.component';




@NgModule({
  declarations: [
    AppComponent,
    GetJobComponent,
    ApplyToJobComponent,
    ResultPageComponent,
    LoginPageComponent,
    AdminPageComponent,
    GetJobAdminComponent,
    AddJobComponent,
    GetApplicantComponent,
    DeleteJobComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    HttpClientModule,
    FormsModule,
    HttpModule

  ],
  providers: [JobServiceService,
    ApplicantService,
    AuthenticationService,
    AuthGuard,
    LoginService,
    HrService,
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
