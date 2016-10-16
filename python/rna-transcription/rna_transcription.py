def to_rna(sequence):
    """Takes a string representative of DNA nucleotide/s
    Returns a string representative of corresponding RNA nucleotide"""
    RNA_map = []
    for ch in sequence:
        if ch is 'C':
            RNA_map.append('G')
        elif ch is 'G':
            RNA_map.append('C')
        elif ch is 'T':
            RNA_map.append('A')
        else:
            RNA_map.append('U')
    return "".join(RNA_map)
