/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012.
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.restcomm.slee.resource.cap.service.circuitSwitchedCall.wrappers;

import org.restcomm.protocols.ss7.cap.api.service.circuitSwitchedCall.SplitLegResponse;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public class SplitLegResponseWrapper extends CircuitSwitchedCallMessageWrapper<SplitLegResponse> implements SplitLegResponse {

    private static final String EVENT_TYPE_NAME = "ss7.cap.service.circuitSwitchedCall.SPLIT_LEG_RESPONSE";

    public SplitLegResponseWrapper(CAPDialogCircuitSwitchedCallWrapper capDialogWrapper, SplitLegResponse wrappedEvent) {
        super(capDialogWrapper, EVENT_TYPE_NAME, wrappedEvent);
    }

    @Override
    public String toString() {
        return "SplitLegResponseWrapper [wrapped=" + this.wrappedEvent + "]";
    }

}
