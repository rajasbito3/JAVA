import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserDetailModule } from '../user-detail/user-detail.module';
import { User } from './User';

@Component({
  selector: 'app-login1',
  templateUrl: './login1.component.html',
  styleUrls: ['./login1.component.css']
})
export class Login1Component implements OnInit {
  
  userObj: User = new User();
  constructor(private router:Router) { }

  ngOnInit(): void {
  }
authenticate(){
if (this.userObj.username=="Admin" && this.userObj.password =="Admin123"){
console.log('Welcome Admin User');
sessionStorage.setItem("x",JSON.stringify(this.userObj));   
this.router.navigate(['/admin-dashboard']);
}
else 
{
  console.log('Welcome End User');
  sessionStorage.setItem("x",JSON.stringify(this.userObj));
  this.router.navigate(['/dashboard']);
}

}
}
