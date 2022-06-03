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

  public foundPathResponse = [];

  constructor(private input: PathfinderService) {}

  ngOnInit(): void {}

  calculateGreedyPath() {
    alert(message);

    this.input.postGreedyPath(this.data).subscribe((result: any) => {
      console.log(result);
      this.foundPathResponse = result;
    });
  }

  calculateAntPath() {
    this.input.postAntPath(this.data).subscribe((result: any) => {
      this.foundPathResponse = result;
    });
  }

  generateData() {
    // GET() generated data from api
    var x = prompt('How much cities should I generate?', '25');
    var numberOfGenerated = parseInt(x !== null ? x : '');

    this.input.generateData(numberOfGenerated).subscribe((result: any) => {
      console.log(JSON.stringify(result));
    });
  }
}
