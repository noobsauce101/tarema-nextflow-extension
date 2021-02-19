/*
 * Copyright 2020, Seqera Labs
 * Copyright 2013-2019, Centre for Genomic Regulation (CRG)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nextflow.exception

import sun.misc.Signal

/**
 * Adaptor exception to wrap a termination signal
 *
 * @see Signal
 * @see sun.misc.SignalHandler
 * @see nextflow.Session#abort(java.lang.Throwable)
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */

class AbortSignalException extends RuntimeException {

    AbortSignalException( Signal sig ) {
        super(sig.toString())
    }

}
