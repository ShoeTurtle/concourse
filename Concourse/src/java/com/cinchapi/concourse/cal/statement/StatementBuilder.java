/*
 * This project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this project. If not, see <http://www.gnu.org/licenses/>.
 */
package com.cinchapi.concourse.cal.statement;

import com.cinchapi.concourse.cal.result.Result;
import com.cinchapi.concourse.services.services.cal.statement.Statement.Action;

/**
 * 
 * 
 * @author jnelson
 */
public class StatementBuilder {
	
	private Action action;
	
	public StatementBuilder setAction(Action action){
		this.action = action;
		return this;
	}
	
	public <T extends Result> Statement<T> build(){
		Statement<T> statement;
		if(action == Action.ADD){
			statement = new AddActionStatement();
		}
	}

}
