import {Component, OnInit} from '@angular/core';
import 'rxjs/add/operator/filter';
import {JobServiceService} from '../../service/job-service.service'
import {JobResource} from "../../resource/job-resource";
import {ApplicantDto} from "../../dto/applicant-dto";
import {ApplicantService} from "../../service/applicant.service";
import {ActivatedRoute, Router} from "@angular/router";
@Component({
  selector: 'app-apply-to-job',
  templateUrl: './apply-to-job.component.html',
  styleUrls: ['./apply-to-job.component.css']
})
export class ApplyToJobComponent implements OnInit {
  jobTitle: string;
  applicant: ApplicantDto;
  job: JobResource;

  constructor(private  route: ActivatedRoute,
              private router: Router,
              private jobServiceService: JobServiceService,
              private  applicantService: ApplicantService) {
    this.applicant = new ApplicantDto();
  }

  ngOnInit() {
    this.route.queryParams
      .filter(params => params.jobTitle)
      .subscribe(params => {
        console.log(params);
        this.jobTitle = params.jobTitle;
        console.log(this.jobTitle);
      });

    this.jobServiceService.findJob(this.jobTitle).subscribe(data => {
      this.job = data;
    });


  }

  onSubmit() {
    this.applicantService.save(this.applicant, this.jobTitle).subscribe(result => this.gotoResultPage());
  }
  gotoResultPage() {
    this.router.navigate(['/result-page']);
  }
}
