import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardService } from 'ontimize-web-ngx';

import { MainComponent } from './main.component';





export const routes: Routes = [
  {
    path: '',
    component: MainComponent,
    canActivate: [AuthGuardService],
    children: [
      { path: '', redirectTo: 'home', pathMatch: 'full' },
      { path: 'home', loadChildren: () => import('./home/home.module').then(m => m.HomeModule) },
      { path: 'employees', loadChildren: () => import('./employees/Employees.Module').then(m => m.EmployeesModule)},
      { path: 'projects', loadChildren: () => import('./projects/Projects.Module').then(m => m.ProjectsModule)},
      { path: 'employee-project', loadChildren: () => import('./employee-project/employee-project.Module').then(m => m.EmployeeProjectModule)}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MainRoutingModule { }
