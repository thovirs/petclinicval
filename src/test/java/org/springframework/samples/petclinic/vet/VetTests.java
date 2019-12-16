/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.vet;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

import org.springframework.util.SerializationUtils;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Dave Syer
 *
 */
public class VetTests {

    @Test
    public void testSerialization() {
        final Vet vet = new Vet();
        vet.setFirstName("Zaphod");
        vet.setLastName("Beeblebrox");
        vet.setId(123);
        final Vet other = (Vet) SerializationUtils.deserialize(SerializationUtils.serialize(vet));
        assertThat(other.getFirstName()).isEqualTo(vet.getFirstName());
        assertThat(other.getLastName()).isEqualTo(vet.getLastName());
        assertThat(other.getId()).isEqualTo(vet.getId());
    }

    @Test
    public void getNumberOfSpecialties() {
        Specialty specialty1 = new Specialty();
        specialty1.setName("Surgery");
        Vet vet = new Vet();
        vet.addSpecialty(specialty1);
        final int nrOfSpecialties = vet.getNrOfSpecialties();

        assertEquals(1, nrOfSpecialties);        
    }

    @Test
    public void hasSpecialties() {
        Specialty specialty1 = new Specialty();
        specialty1.setName("Surgery");
        Vet vet = new Vet();
        vet.addSpecialty(specialty1);
        List<Specialty> listOfSpecialties = vet.getSpecialties();
        boolean isEmpty = listOfSpecialties.isEmpty();
        assertEquals(false, isEmpty);
    }

}
