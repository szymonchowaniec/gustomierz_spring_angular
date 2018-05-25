
import { Component, OnInit } from '@angular/core';
import {PictureService} from "../shared/picture/picture.service";
import {GiphyService} from "../shared/giphy/giphy.service";

@Component({
  selector: 'app-picture-list',
  templateUrl: './picture-list.component.html',
  styleUrls: ['./picture-list.component.css']
})
export class PictureListComponent implements OnInit {

  pictures: Array<any>;

  constructor(private pictureService: PictureService,
              private giphyService: GiphyService) { }

  ngOnInit() {

    this.pictureService.getAll().subscribe(data=>{
      this.pictures = data;

      for (const picture of this.pictures){
        this.giphyService.get(picture.name).subscribe(url => picture.giphyUrl = url);
      }
    });
  }

}
