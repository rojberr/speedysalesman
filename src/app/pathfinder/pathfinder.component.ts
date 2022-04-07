import { Component, OnInit } from '@angular/core';
import { PathfinderService } from '../core/services/pathfinder.service';

@Component({
  selector: 'app-pathfinder',
  templateUrl: './pathfinder.component.html',
  styleUrls: ['./pathfinder.component.css'],
})
export class PathfinderComponent implements OnInit {
  data: any;

  constructor(private input: PathfinderService) {}

  ngOnInit(): void {}

  sendData() {
    const message = `My name is ${this.data}`;
    // grab all the firlds and their values
    // const nameInput = document.querySelector('input[name=name]').value;
    alert(message);

    this.input.post(this.data).subscribe((result: any) => {
      console.warn(result);
    });
  }
}
