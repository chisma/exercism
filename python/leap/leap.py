def is_leap_year(year):
    """Accepts a year in Gregorian calender and checks whether a leap year
        Returns True or False"""
    if year%4 == 0:
        if year%100 != 0:
            return True
        elif year%400 == 0:
            return True
        else:
            return False
    return False
            
