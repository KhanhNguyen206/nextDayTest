public class nextDay {
    private boolean isLeapYear(int a) {
        if (a % 4 == 0) {
            if (a % 400 == 0) {
                return true;
            } else if (a % 100 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean isDate(int day, int month, int year) {
        if (day <= 0 || day > 31 || month <= 0 || month > 12 || year < 0) {
            return false;
        }
        return true;
    }


    public int[] nextDay(int day, int month, int year) {
        boolean leapYear = this.isLeapYear(year);
        int[] date = {0, 0, 0};
        if (this.isDate(day, month, year)) {
            if (leapYear) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        if (day == 31) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case 9:
                        if (day == 30) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 2:
                        if (day == 29) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 12:
                        if (day == 31) {
                            date[0] = 1;
                            date[1] = 1;
                            date[2] = ++year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                }
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                        if (day == 31) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 4:
                    case 6:
                    case 11:
                    case 9:
                        if (day == 30) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 2:
                        if (day == 28) {
                            date[0] = 1;
                            date[1] = ++month;
                            date[2] = year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                    case 12:
                        if (day == 31) {
                            date[0] = 1;
                            date[1] = 1;
                            date[2] = ++year;
                            return date;
                        } else {
                            date[0] = ++day;
                            date[1] = month;
                            date[2] = year;
                            return date;
                        }
                }
            }
        }
        return date;
    }
}