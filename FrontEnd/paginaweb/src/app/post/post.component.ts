import { Component, OnInit } from '@angular/core';
import { PostService } from './post.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  post;

  constructor(private postService: PostService) { }

  ngOnInit(): void {
    this.post = this.postService.getPost().subscribe(
      post => this.post = post
    );
  }

}