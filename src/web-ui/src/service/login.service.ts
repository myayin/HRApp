
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { JobResource } from '../resource/job-resource';
import {LoginRequestDto} from "../dto/login-request-dto";

@Injectable()
export class  LoginService {


   loginRequestUrl: string;

  constructor(private http: HttpClient) {
    this.loginRequestUrl = 'http://localhost:8080/token/login';


  }

  public login(loginRequest:LoginRequestDto) {

    return (this.http.post<JobResource[]>(this.loginRequestUrl,loginRequest));
  }


}
