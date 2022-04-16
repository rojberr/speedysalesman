import { Component, OnInit } from '@angular/core';
import { PathfinderService } from '../core/services/pathfinder.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-pathfinder',
  templateUrl: './pathfinder.component.html',
  styleUrls: ['./pathfinder.component.css'],
})
export class PathfinderComponent implements OnInit {
  data: Observable<any[]> | undefined;

  constructor(private input: PathfinderService) {}

  ngOnInit(): void {}

  sendData() {
    const message = `My name is ${this.data}`;
    // grab all the fields and their values
    // const nameInput = document.querySelector('input[name=name]').value;
    alert(message);

    this.input.postData(this.data).subscribe((result: any) => {
      console.log(result);
    });
  }

  generateData() {
    // GET() generated data from api
    alert('You are generating data!');

    this.input.generateData().subscribe((result: any) => {
      console.log(result);
    });
  }
}
