def distance(strand1, strand2):
    """Takes two DNA strands and computes hamming distance
    Returns the hamming distance as integer"""
    import operator
    return map(operator.eq, strand1, strand2).count(False)
#   return map(lambda (x,y):x == y, zip(strand1,strand2)).count(False)
