/**
 *
 * Copyright (c) 2009-2016 Freedomotic team http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.freedomotic.model.object;

import com.freedomotic.model.charting.UsageData;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matteo Mazzoni <matteo@bestmazzo.it>
 */
@XmlRootElement
public class DataBehavior extends Behavior{
    
    private List<UsageData> data;

    /**
     *
     * @param data
     */
    public void setData(List<UsageData> data){
        this.data = data;
    }
    
    /**
     *
     * @param data
     */
    public void addData(List<UsageData> data){
        this.data.addAll(data);
    }
    
    /**
     *
     * @return
     */
    public List<UsageData> getData(){
        return data;
    }
    

    
    
    
    
}
