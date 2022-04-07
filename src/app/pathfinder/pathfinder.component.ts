import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pathfinder',
  templateUrl: './pathfinder.component.html',
  styleUrls: ['./pathfinder.component.css'],
})
export class PathfinderComponent implements OnInit {
  data: any;

  constructor() {}

  ngOnInit(): void {}

  submitForm() {
    const message = `My name is ${this.data}`;
    // grab all the firlds and their values
    // const nameInput = document.querySelector('input[name=name]').value;
    alert(message);
  }
}
