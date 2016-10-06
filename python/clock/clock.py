class Clock(object):
    def __init__(self, hours, minutes):
        self.hours = hours
        self.minutes = minutes
    def __eq__(self, other):
        if str(self).split() == str(other).split():
            return True
        else:
            return False
    def add(self, minutes):
        self.minutes += minutes
        return str(self)
    def __str__(self):
        hoursRange = range(24)
        minutesRange = range(60)
        while  self.hours > 23:
            self.hours = self.hours - 24
            if self.hours in hoursRange:
                break
        while self.hours < 0:
            self.hours = self.hours + 24
            if self.hours in hoursRange:
                break
        while self.minutes > 59:
            self.minutes = self.minutes - 60
            if self.hours < 24:
                if self.hours == 23:
                    self.hours = 0
                else:
                    self.hours = self.hours + 1
            if self.minutes in minutesRange:
                break
        while self.minutes < 0:
            self.minutes = self.minutes + 60
            self.hours = self.hours - 1
            if self.hours < 0:
                self.hours = self.hours + 24
            if self.minutes in minutesRange:
                break
        return "%02d:%02d" % (self.hours,self.minutes)
    #return  '02d'hours, '02d'minutes
