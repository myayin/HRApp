import { Component, OnInit } from '@angular/core';
import {ApplicantResource} from "../../resource/applicant-resource";
import {ActivatedRoute, Router} from "@angular/router";
import {HrService} from "../../service/hr.service";

@Component({
  selector: 'app-delete-job',
  templateUrl: './delete-job.component.html',
  styleUrls: ['./delete-job.component.css']
})
export class DeleteJobComponent implements OnInit {

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
window.alert(this.jobTitle)
    this.hrService.deleteJob(this.jobTitle).subscribe(result => this.gotoPreviousPage());
  }
  gotoPreviousPage() {
    this.router.navigate(['/see-all-job']);
  }


}
