///////////////////////////////////////////////////////////////////////////////
// Copyright (C) 2001 Jason Baldridge and Gann Bierner
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
//////////////////////////////////////////////////////////////////////////////   
package ch.epfl.bbp.shaded.opennlp.maxent;



/**
 * An interface for objects which read events during training.
 *
 * @author      Jason Baldridge
 * @version $Revision: 1.2 $, $Date: 2003/04/05 13:33:39 $
 */
public interface EventCollector {

    /**
     * Return the events which this EventCollector has gathered.  It must get
     * its data from a constructor.
     *
     * @return the events that this EventCollector has gathered
     */
    public Event[] getEvents();

    /**
     * Return the events which this EventCollector has gathered based on
     * whether we wish to train a model or evaluate one based on those
     * events.
     * 
     * @param evalMode true if we are evaluating based on the events, false if
     *                 we are training.
     * @return the events that this EventCollector has gathered
     */
    public Event[] getEvents(boolean evalMode);
}
