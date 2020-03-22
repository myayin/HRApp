import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {JobResource} from '../resource/job-resource';
import {Observable} from 'rxjs';
import {HttpParams} from "@angular/common/http";
import {ApplicantResource} from "../resource/applicant-resource";
import {JobDto} from "../dto/job-dto";
import {ApplicantDto} from "../dto/applicant-dto";

@Injectable()
export class HrService {

  getApplicantUrl: string;
  deleteJobUrl: string;
  addJobUrl: string;

  constructor(private http: HttpClient) {
    this.getApplicantUrl = 'http://localhost:8080/HR/get-applicant-to-job';
    this.deleteJobUrl = 'http://localhost:8080/HR/delete-job';
    this.addJobUrl = 'http://localhost:8080/HR/add-job'
  }

  public getApplicant(jobTitle: string): Observable<ApplicantResource[]> {
    const opts = {params: new HttpParams({fromString: "jobTitle=" + jobTitle})};
    return this.http.get<ApplicantResource[]>(this.getApplicantUrl, opts);
  }

  public deleteJob(jobTitle: string): Observable<JobResource[]> {
    const opts = {params: new HttpParams({fromString: "jobTitle=" + jobTitle})};
    return this.http.get<JobResource[]>(this.deleteJobUrl, opts);
  }

  public addJob(jobDto: JobDto) {
    return this.http.post<ApplicantDto>(this.addJobUrl, jobDto);
  }
}
