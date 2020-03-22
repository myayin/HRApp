import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {JobServiceService} from "../../service/job-service.service";
import {ApplicantService} from "../../service/applicant.service";
import {HrService} from "../../service/hr.service";
import {JobDto} from "../../dto/job-dto";

@Component({
  selector: 'app-add-job',
  templateUrl: './add-job.component.html',
  styleUrls: ['./add-job.component.css']
})
export class AddJobComponent  {
  jobDto: JobDto

  constructor(private  route: ActivatedRoute,
              private router: Router,
              private hrService: HrService) {
    this.jobDto = new JobDto();
  }

  onSubmit() {
    this.hrService.addJob(this.jobDto).subscribe(result => this.gotoNextPage());
  }
  gotoNextPage() {
    this.router.navigate(['/see-all-job']);
  }
}
