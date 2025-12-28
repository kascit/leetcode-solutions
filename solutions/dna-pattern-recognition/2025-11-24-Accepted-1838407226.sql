/*
Submission: 1838407226
Status: Accepted
Timestamp: 2025-11-24 10:05:36 UTC
Runtime: 911 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select sample_id, dna_sequence, species,
dna_sequence like 'ATG%' as has_start,
dna_sequence like '%TAA' OR dna_sequence LIKE '%TGA' OR dna_sequence LIKE '%TAG' as has_stop,
dna_sequence like '%ATAT%' as has_atat,
dna_sequence like '%GGG%' as has_ggg
from samples order by sample_id;
