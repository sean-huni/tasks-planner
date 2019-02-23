import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from "@angular/forms";

import {AppComponent} from './app.component';
import {TaskAddComponent} from './components/tasks/task-add/task-add.component';
import {TaskListComponent} from './components/tasks/task-list/task-list.component';
import {TasksComponent} from './components/tasks/tasks.component';

import {TaskService} from "./services/task.service";

@NgModule({
    declarations: [
        AppComponent,
        TaskAddComponent,
        TaskListComponent,
        TasksComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule
    ],
    providers: [TaskService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
