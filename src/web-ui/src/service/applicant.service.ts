import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {HttpParams} from "@angular/common/http";
import {ApplicantDto} from "../dto/applicant-dto";

@Injectable()
export class ApplicantService {

  applyToJobUrl: string;

  constructor(private http: HttpClient) {
    this.applyToJobUrl = 'http://localhost:8080/applicant/apply-to-job';
  }

  public save(applicant: ApplicantDto, jobTitle: string) {
    const opts = {params: new HttpParams({fromString: "jobTitle=" + jobTitle})};
    return this.http.post<ApplicantDto>(this.applyToJobUrl, applicant, opts);
  }


}
