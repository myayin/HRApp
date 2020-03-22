import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {HrService} from "../../service/hr.service";
import {ApplicantResource} from "../../resource/applicant-resource";

@Component({
  selector: 'app-get-applicant',
  templateUrl: './get-applicant.component.html',
  styleUrls: ['./get-applicant.component.css']
})
export class GetApplicantComponent implements OnInit {
  applicantResources: ApplicantResource[];
  jobTitle: string;

  constructor(private  route: ActivatedRoute,
              private  router: Router,
              private hrService: HrService) {
  }

  ngOnInit() {
    this.route.queryParams
      .filter(params => params.jobTitle)
      .subscribe(params => {
        console.log(params);
        this.jobTitle = params.jobTitle;
        console.log(this.jobTitle);
      });

    this.hrService.getApplicant(this.jobTitle).subscribe(data => {
      this.applicantResources = data;});
  }

}
