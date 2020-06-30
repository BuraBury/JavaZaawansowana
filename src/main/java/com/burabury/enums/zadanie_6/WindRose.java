package com.burabury.enums.zadanie_6;

public enum WindRose {
    N,
    NE,
    E,
    SE,
    S,
    SW,
    W,
    NW;

    String getLabel() {
        switch (this) {
            case N:
                return "North";

            case NE:
                return "North-East";

            case E:
                return "East";

            case SE:
                return "South-East";

            case S:
                return "South";

            case SW:
                return "South-West";

            case W:
                return "West";

            case NW:
                return "North-West";

        }
        throw new IllegalArgumentException("Wrong direction");
    }

    int getAngle() {
        switch (this) {
            case N:
                return 0;

            case NE:
                return 45;

            case E:
                return 90;

            case SE:
                return 135;

            case S:
                return 180;

            case SW:
                return 225;

            case W:
                return 270;

            case NW:
                return 315;
        }
        throw new IllegalArgumentException("Wrong direction");
    }

    static WindRose getDirection(Integer angle) throws IllegalArgumentException {

        if (angle > 360 || angle < 0)
            throw new IllegalArgumentException("wrong direction");

        if (angle >= 0 && angle <= 23 || Math.ceil(angle) == 360) {
            return N;
        } else if (angle <= 68) {
            return NE;
        } else if (angle <= 113) {
            return E;
        } else if (angle <= 158) {
            return SE;
        } else if (angle <= 203) {
            return S;
        } else if (angle <= 248) {
            return SW;
        } else if (angle <= 293) {
            return W;
        } else {
            return NE;
        }

    }


}
