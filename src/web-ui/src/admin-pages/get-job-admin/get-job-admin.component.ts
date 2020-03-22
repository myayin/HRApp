import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {JobResource} from '../../resource/job-resource';
import {JobServiceService} from '../../service/job-service.service';


@Component({
  selector: 'app-get-job-admin',
  templateUrl: './get-job-admin.component.html',
  styleUrls: ['./get-job-admin.component.css'],
  providers: [JobServiceService]
})
export class GetJobAdminComponent implements OnInit {

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
