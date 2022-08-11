import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { PathfinderService } from '../core/services/pathfinder.service';

@Component({
  selector: 'app-pathfinder',
  templateUrl: './pathfinder.component.html',
  styleUrls: ['./pathfinder.component.css'],
})
export class PathfinderComponent {
  data: Observable<any[]> | undefined;

  public dataSize: number | undefined;
  public foundPathResponse = [];
  public generatedResponse = [];

  constructor(private input: PathfinderService) {}

  calculateGreedyPath() {
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
      this.generatedResponse = result;
      console.log(JSON.stringify(result));
    });
  }

  parseGeneratedData(dataToParse: any) {
    const result = dataToParse
      .replace('[', '')
      .replaceAll('{"id":', '')
      .replaceAll(',"x":', ' ')
      .replaceAll(',"y":', ' ')
      .replaceAll('},', '\n')
      .replace('}]', '');
    return result.split('\n').length + '\n' + result;
  }
}
