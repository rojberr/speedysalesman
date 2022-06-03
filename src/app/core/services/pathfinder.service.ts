import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class PathfinderService {
  greedyURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/greedy';
  antURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/ant';
  generateURL = 'https://speedysalesman-api.herokuapp.com/pathfinder/generate';

  constructor(private http: HttpClient) {}

  /**
   * Post the data in format:
   * #amount
   * 1 x y
   * 2 x y
   * ...
   * And calculate using TSP greedy algorithm
   */
  postGreedyPath(data: any) {
    return this.http.post(this.greedyURL, data, { responseType: 'text' });
  }

  /**
   * Post the data in format:
   * #amount
   * 1 x y
   * 2 x y
   * ...
   * And calculate using TSP ant algorithm
   */
  postAntPath(data: any) {
    return this.http.post(this.antURL, data, { responseType: 'text' });
  }

  /**
   * Generate #n amount of instances
   */
  generateData(numberOfGenerated: number) {
    return this.http.post(this.generateURL, numberOfGenerated, {
      responseType: 'text',
    });
  }
}
