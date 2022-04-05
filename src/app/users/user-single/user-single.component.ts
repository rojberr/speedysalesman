import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-user-single',
  templateUrl: './user-single.component.html',
  styleUrls: ['./user-single.component.css']
})
export class UserSingleComponent implements OnInit {
  user: any;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    // grab the username out of the url

    // use the userservice to get data from github api
    this.userService
      .getUser('ezmobius')
      .subscribe(user => this.user = user);

    //bind that to a user variable
  }

}
