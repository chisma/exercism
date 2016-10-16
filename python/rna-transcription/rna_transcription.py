def transform(key):
    return {
        'C': 'G',
        'G': 'C',
        'T': 'A',
        'A': 'U'
    }[key]


def to_rna(seq):
    return ''.join(map(transform, seq))
