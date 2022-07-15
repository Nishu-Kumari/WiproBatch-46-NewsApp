import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NewsService {
  api_key = '9496ca5eee80435e9d220aec72e7cad7';
  springEndpoint: string;

  constructor(private http: HttpClient) {
    this.springEndpoint = 'http://localhost:8081/api/news';
  }

  searchNews(query: string) {
    const url = 'https://newsapi.org/v2/everything?' +
      'q=' + query +
      '&apiKey=' + this.api_key;
    console.log(url);
    return this.http.get(url);
  }

  addToNews(news) {
    return this.http.post(this.springEndpoint, news);
  }

  getFavouriteNewsList(): Observable<Array<any>> {
    return this.http.get<Array<any>>(this.springEndpoint);
  }

  deleteFromFavouriteList(news) {
    return this.http.delete(this.springEndpoint + "/" + news.id, { responseType: 'text' });
  }

  getTopNews() {
    const url = 'https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=' +
      this.api_key;
    console.log(url);
    return this.http.get(url);
  }

}
