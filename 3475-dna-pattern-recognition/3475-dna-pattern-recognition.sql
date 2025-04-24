/*
Biologists are studying basic patterns in DNA sequences. Write a solution to identify sample_id with the following patterns:

Sequences that start with ATG (a common start codon)
Sequences that end with either TAA, TAG, or TGA (stop codons)
Sequences containing the motif ATAT (a simple repeated pattern)
Sequences that have at least 3 consecutive G (like GGG or GGGG)
Return the result table ordered by sample_id in ascending order.
*/
SELECT sample_id
    , dna_sequence
    , species
    , IF(dna_sequence LIKE 'ATG%', 1, 0) 'has_start'
    , IF(dna_sequence LIKE '%TAA' OR dna_sequence LIKE '%TAG' OR dna_sequence LIKE '%TGA', 1, 0) 'has_stop'
    , IF(dna_sequence LIKE '%ATAT%', 1, 0) 'has_atat'
    , IF(dna_sequence LIKE '%GGG%', 1, 0) 'has_ggg'
FROM Samples
ORDER BY sample_id;