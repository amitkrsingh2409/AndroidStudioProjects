/**
   Copyright: 2011 Android Aalto

   This file is part of BookingRoom.

   BookingRoom is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   BookingRoom is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with BookingRoom. If not, see <http://www.gnu.org/licenses/>.
 */

package com.bookroom.delhivery.bookroom.validation;

/**
 * @author hannu
 */
public class ValidationException extends Exception {
    private static final long serialVersionUID = -8754467148756239632L;
    private final ValidationResult errors;

    public ValidationException(ValidationResult errors, String detailMessage) {
        super(detailMessage);
        this.errors = errors;
    }

    public ValidationResult getErrors() {
        return errors;
    }
}
