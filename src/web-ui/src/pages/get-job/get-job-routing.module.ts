import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ApplyToJobComponent} from '../apply-to-job/apply-to-job.component'

const routes: Routes = [
  { path: 'apply-job', component: ApplyToJobComponent }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class GetJobRoutingModule { }
