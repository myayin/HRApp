import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {JobResource} from '../../resource/job-resource';
import {JobServiceService} from '../../service/job-service.service';


@Component({
  selector: 'app-get-job',
  templateUrl: './get-job.component.html',
  styleUrls: ['./get-job.component.css'],
  providers: [JobServiceService]
})
export class GetJobComponent implements OnInit {

  jobs: JobResource [];

  constructor(private jobServiceService: JobServiceService,
              private  route: ActivatedRoute,
              private  router: Router) {
  }

  ngOnInit() {

    this.jobServiceService.findAll().subscribe(data => {
      this.jobs = data;

    });


  }

}
