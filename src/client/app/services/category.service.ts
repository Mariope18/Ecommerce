// DEPENDENCIES
import { Observable } from 'rxjs/Rx';
import { Http, RequestOptions, Headers, Response } from '@angular/http';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';

// SECURITY
import { AuthenticationService } from '../security/authentication.service';

// CONFIG
import { config } from "../../config/properties";

// MODEL
import { CategoryBaseService } from "./base/category.base.service";
import { Category } from '../domain/ecommerce_db/category';

/**
 * YOU CAN OVERRIDE HERE CategoryBaseService
 */

@Injectable()
export class CategoryService extends CategoryBaseService {
    
    // CONSTRUCTOR
    constructor(http: Http, authenticationService: AuthenticationService) {
            super(http, authenticationService);
    }
    
}