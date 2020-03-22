import {Component, OnInit} from '@angular/core';
import {LoginRequestDto} from '../../dto/login-request-dto';
import {ActivatedRoute, Router} from "@angular/router";
import {LoginService} from "../../service/login.service";
import {AuthenticationService} from "../../lib/security/authentication.service";

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent {

  user: LoginRequestDto

  constructor(private route: ActivatedRoute,
              private router: Router,
              private loginService: LoginService) {
    this.user = new LoginRequestDto();
  }

  onSubmit() {
    this.loginService.login(this.user).subscribe(result => this.gotoAdminPage());
  }
  gotoAdminPage() {
    this.router.navigate(['/admin-page']);
  }

}
