import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {PictureService} from "./shared/picture/picture.service";
import { PictureListComponent } from './picture-list/picture-list.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule} from "@angular/material";
import {GiphyService} from "./shared/giphy/giphy.service";


@NgModule({
  declarations: [
    AppComponent,
    PictureListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule

  ],
  providers: [PictureService,GiphyService],
  bootstrap: [AppComponent]
})
export class AppModule { }
