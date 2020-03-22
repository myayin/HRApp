
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { JobResource } from '../resource/job-resource';
import { Observable } from 'rxjs';
import {HttpParams} from "@angular/common/http";

@Injectable()
export class  JobServiceService {

   getJobsUrl: string;
   getJobUrl: string;

  constructor(private http: HttpClient) {
    this.getJobsUrl = 'http://localhost:8080/job/get-jobs';
    this.getJobUrl = 'http://localhost:8080/job/get-job';

  }

  public findAll(): Observable<JobResource[]> {

    return (this.http.get<JobResource[]>(this.getJobsUrl));
  }
  public findJob( jobTitle: string): Observable<JobResource> {
    const opts = { params: new HttpParams({fromString: "jobTitle="+jobTitle}) };
    return (this.http.get<JobResource>(this.getJobUrl,opts));
  }

}
